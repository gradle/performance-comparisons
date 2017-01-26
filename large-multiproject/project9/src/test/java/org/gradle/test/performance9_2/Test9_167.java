package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_167 {
    private final Production9_167 production = new Production9_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}