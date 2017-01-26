package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_89 {
    private final Production64_89 production = new Production64_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}