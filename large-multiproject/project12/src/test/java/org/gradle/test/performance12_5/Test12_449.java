package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_449 {
    private final Production12_449 production = new Production12_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}