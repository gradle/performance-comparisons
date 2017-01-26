package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_495 {
    private final Production19_495 production = new Production19_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}