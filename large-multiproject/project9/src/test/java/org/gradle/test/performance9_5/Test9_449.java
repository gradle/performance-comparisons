package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_449 {
    private final Production9_449 production = new Production9_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}