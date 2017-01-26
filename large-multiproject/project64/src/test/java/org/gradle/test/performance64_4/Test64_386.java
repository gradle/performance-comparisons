package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_386 {
    private final Production64_386 production = new Production64_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}