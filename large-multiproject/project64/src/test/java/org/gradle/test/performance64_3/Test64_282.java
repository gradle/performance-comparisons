package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_282 {
    private final Production64_282 production = new Production64_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}