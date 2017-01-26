package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_112 {
    private final Production78_112 production = new Production78_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}