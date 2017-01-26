package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_96 {
    private final Production19_96 production = new Production19_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}