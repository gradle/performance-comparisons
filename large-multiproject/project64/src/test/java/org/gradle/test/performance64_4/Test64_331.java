package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_331 {
    private final Production64_331 production = new Production64_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}