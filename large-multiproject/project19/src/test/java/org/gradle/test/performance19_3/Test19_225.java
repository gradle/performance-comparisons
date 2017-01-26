package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_225 {
    private final Production19_225 production = new Production19_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}