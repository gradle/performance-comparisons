package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_119 {
    private final Production45_119 production = new Production45_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}