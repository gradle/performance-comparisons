package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_166 {
    private final Production9_166 production = new Production9_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}