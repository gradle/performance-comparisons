package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_255 {
    private final Production64_255 production = new Production64_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}