package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_449 {
    private final Production96_449 production = new Production96_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}