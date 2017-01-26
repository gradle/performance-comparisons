package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_286 {
    private final Production11_286 production = new Production11_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}