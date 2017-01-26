package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_495 {
    private final Production34_495 production = new Production34_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}