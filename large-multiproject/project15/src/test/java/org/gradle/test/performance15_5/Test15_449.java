package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_449 {
    private final Production15_449 production = new Production15_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}