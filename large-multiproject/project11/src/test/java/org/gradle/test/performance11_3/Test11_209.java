package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_209 {
    private final Production11_209 production = new Production11_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}