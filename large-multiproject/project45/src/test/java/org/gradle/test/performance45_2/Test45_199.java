package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_199 {
    private final Production45_199 production = new Production45_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}