package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_43 {
    private final Production64_43 production = new Production64_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}