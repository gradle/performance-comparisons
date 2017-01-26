package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_9 {
    private final Production52_9 production = new Production52_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}