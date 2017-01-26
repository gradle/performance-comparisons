package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_449 {
    private final Production52_449 production = new Production52_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}