package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_183 {
    private final Production19_183 production = new Production19_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}