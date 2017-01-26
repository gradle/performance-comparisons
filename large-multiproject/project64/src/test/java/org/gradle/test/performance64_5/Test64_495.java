package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_495 {
    private final Production64_495 production = new Production64_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}