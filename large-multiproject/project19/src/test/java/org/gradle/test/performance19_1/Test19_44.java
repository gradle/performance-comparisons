package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_44 {
    private final Production19_44 production = new Production19_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}