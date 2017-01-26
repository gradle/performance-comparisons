package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_457 {
    private final Production34_457 production = new Production34_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}