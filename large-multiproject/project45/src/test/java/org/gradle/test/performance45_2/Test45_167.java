package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_167 {
    private final Production45_167 production = new Production45_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}