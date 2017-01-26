package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_45 {
    private final Production9_45 production = new Production9_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}