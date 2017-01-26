package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_449 {
    private final Production27_449 production = new Production27_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}