package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_72 {
    private final Production64_72 production = new Production64_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}