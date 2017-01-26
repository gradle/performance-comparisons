package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_77 {
    private final Production64_77 production = new Production64_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}