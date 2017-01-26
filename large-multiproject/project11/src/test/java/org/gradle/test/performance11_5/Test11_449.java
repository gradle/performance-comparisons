package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_449 {
    private final Production11_449 production = new Production11_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}