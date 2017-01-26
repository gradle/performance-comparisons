package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_449 {
    private final Production49_449 production = new Production49_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}