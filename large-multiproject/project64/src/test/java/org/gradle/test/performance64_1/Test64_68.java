package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_68 {
    private final Production64_68 production = new Production64_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}