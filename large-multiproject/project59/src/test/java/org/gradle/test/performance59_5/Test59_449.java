package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_449 {
    private final Production59_449 production = new Production59_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}