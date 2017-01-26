package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_9 {
    private final Production19_9 production = new Production19_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}