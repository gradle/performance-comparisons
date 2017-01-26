package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_172 {
    private final Production9_172 production = new Production9_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}