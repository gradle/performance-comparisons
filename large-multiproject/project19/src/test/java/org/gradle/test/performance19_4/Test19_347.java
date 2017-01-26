package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_347 {
    private final Production19_347 production = new Production19_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}