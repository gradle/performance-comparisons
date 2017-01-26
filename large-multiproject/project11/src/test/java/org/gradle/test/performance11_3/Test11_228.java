package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_228 {
    private final Production11_228 production = new Production11_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}