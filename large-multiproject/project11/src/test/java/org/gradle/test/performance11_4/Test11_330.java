package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_330 {
    private final Production11_330 production = new Production11_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}