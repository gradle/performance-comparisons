package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_66 {
    private final Production19_66 production = new Production19_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}