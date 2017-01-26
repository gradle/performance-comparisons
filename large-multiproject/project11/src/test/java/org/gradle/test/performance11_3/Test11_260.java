package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_260 {
    private final Production11_260 production = new Production11_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}