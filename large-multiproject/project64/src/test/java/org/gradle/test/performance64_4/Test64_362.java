package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_362 {
    private final Production64_362 production = new Production64_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}