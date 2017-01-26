package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_444 {
    private final Production64_444 production = new Production64_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}