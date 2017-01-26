package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_29 {
    private final Production19_29 production = new Production19_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}