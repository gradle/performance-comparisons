package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_449 {
    private final Production86_449 production = new Production86_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}