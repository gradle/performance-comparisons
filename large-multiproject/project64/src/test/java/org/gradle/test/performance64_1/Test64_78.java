package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_78 {
    private final Production64_78 production = new Production64_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}