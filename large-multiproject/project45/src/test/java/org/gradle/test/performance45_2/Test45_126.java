package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_126 {
    private final Production45_126 production = new Production45_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}