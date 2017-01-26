package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_229 {
    private final Production64_229 production = new Production64_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}