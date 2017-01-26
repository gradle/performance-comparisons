package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_449 {
    private final Production62_449 production = new Production62_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}