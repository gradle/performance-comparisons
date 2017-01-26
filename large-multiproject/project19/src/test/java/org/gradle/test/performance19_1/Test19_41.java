package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_41 {
    private final Production19_41 production = new Production19_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}