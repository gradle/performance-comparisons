package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_495 {
    private final Production78_495 production = new Production78_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}