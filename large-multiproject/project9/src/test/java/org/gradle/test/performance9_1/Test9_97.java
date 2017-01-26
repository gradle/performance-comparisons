package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_97 {
    private final Production9_97 production = new Production9_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}