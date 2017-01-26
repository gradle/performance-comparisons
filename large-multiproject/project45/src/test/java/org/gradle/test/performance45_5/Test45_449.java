package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_449 {
    private final Production45_449 production = new Production45_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}