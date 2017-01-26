package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_449 {
    private final Production33_449 production = new Production33_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}