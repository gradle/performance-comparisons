package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_449 {
    private final Production67_449 production = new Production67_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}