package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_93 {
    private final Production64_93 production = new Production64_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}