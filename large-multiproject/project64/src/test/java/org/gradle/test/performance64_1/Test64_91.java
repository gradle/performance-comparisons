package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_91 {
    private final Production64_91 production = new Production64_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}